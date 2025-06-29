#!/usr/bin/env bash

INPUT_SCHEMA="$1"

OUTPUT_FILE="references.json"

if [ ! -f "$INPUT_SCHEMA" ]; then
  echo "Error: File '$INPUT_SCHEMA' not found."
  exit 1
fi

jq '
  .definitions
  | to_entries
  | map({ key: .key, value: { "$ref": "#/definitions/\(.key)" } })
  | from_entries
  | { properties: . }
' "$INPUT_SCHEMA" > "$OUTPUT_FILE"
