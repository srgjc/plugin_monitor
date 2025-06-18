#!/usr/bin/env bash

INPUT_SCHEMA="$1"

OUTPUT_FILE="references.json"

if [ ! -f "$INPUT_SCHEMA" ]; then
  echo "Error: File '$INPUT_SCHEMA' not found."
  exit 1
fi

jq '
  .definitions
  | keys
  | map({ key: ., value: { "$ref": "#/definitions/\(. )" } })
  | from_entries
  | { properties: . }
' "$INPUT_SCHEMA" > "$OUTPUT_FILE"
