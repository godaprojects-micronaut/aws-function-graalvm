#!/bin/bash
docker build . -t aws-function-graalvm
mkdir -p build
docker run --rm --entrypoint cat aws-function-graalvm  /home/application/function.zip > build/function.zip
