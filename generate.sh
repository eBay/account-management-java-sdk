#!/bin/bash

# Generate Account Management Java SDK using Kiota
# Run this script from the account-management directory

set -e

echo "Generating Account Management Java SDK with Kiota..."

# Clean previous generated code
rm -rf src/main/java/com/ebay/accountmanagement/generated

# Generate from account-v1.yaml
echo "Generating SellAccountV1 API client..."
kiota generate \
  -l java \
  -d specs/openapi/account-v1.yaml \
  -c SellAccountV1ApiClient \
  -n com.ebay.accountmanagement.generated.sellaccountv1 \
  -o src/main/java/com/ebay/accountmanagement/generated/sellaccountv1 \
  --ebc --co

# Generate from account-v2.yaml
echo "Generating SellAccountV2 API client..."
kiota generate \
  -l java \
  -d specs/openapi/account-v2.yaml \
  -c SellAccountV2ApiClient \
  -n com.ebay.accountmanagement.generated.sellaccountv2 \
  -o src/main/java/com/ebay/accountmanagement/generated/sellaccountv2 \
  --ebc --co

# Generate from finances.yaml
echo "Generating SellFinancesV1 API client..."
kiota generate \
  -l java \
  -d specs/openapi/finances.yaml \
  -c SellFinancesV1ApiClient \
  -n com.ebay.accountmanagement.generated.sellfinancesv1 \
  -o src/main/java/com/ebay/accountmanagement/generated/sellfinancesv1 \
  --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src

echo "Code generation complete!"
echo "Next steps:"
echo "  1. Create wrapper clients in src/main/java/com/ebay/accountmanagement/clients/rest/"
echo "  2. Create configuration classes"
echo "  3. Create main facade AccountManagementClient.java"
echo "  4. mvn clean install"
