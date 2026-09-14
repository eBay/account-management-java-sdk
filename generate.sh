#!/usr/bin/env bash

# Copyright 2026 eBay Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -euo pipefail

echo "Generating Account Management Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/accountmanagement/generated

echo "Generating AccountV1ApiClient..."
kiota generate -l java -d specs/openapi/account-v1.json \
  -c AccountV1ApiClient -n com.ebay.accountmanagement.generated.accountv1 \
  -o src/main/java/com/ebay/accountmanagement/generated/accountv1 --ebc --co

echo "Generating AccountV2ApiClient..."
kiota generate -l java -d specs/openapi/account-v2.json \
  -c AccountV2ApiClient -n com.ebay.accountmanagement.generated.accountv2 \
  -o src/main/java/com/ebay/accountmanagement/generated/accountv2 --ebc --co

echo "Generating FinancesApiClient..."
kiota generate -l java -d specs/openapi/finances.json \
  -c FinancesApiClient -n com.ebay.accountmanagement.generated.finances \
  -o src/main/java/com/ebay/accountmanagement/generated/finances --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"
