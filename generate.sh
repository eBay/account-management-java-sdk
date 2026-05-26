#!/bin/bash

# Generate Account Management Java SDK using Kiota
# Run this script from the account-management directory

set -e

echo "Generating Account Management Java SDK with Kiota..."

# Clean previous generated code
rm -rf src/main/java/com/ebay/accountmanagement/generated

# Generate from sell_account_v1_oas3.yaml
echo "Generating SellAccountV1 API client..."
kiota generate \
  -l java \
  -d specs/sell_account_v1_oas3.yaml \
  -c SellAccountV1ApiClient \
  -n com.ebay.accountmanagement.generated.sellaccountv1 \
  -o src/main/java/com/ebay/accountmanagement/generated/sellaccountv1 \
  --ebc --co

# Generate from sell_account_v2_oas3.yaml
echo "Generating SellAccountV2 API client..."
kiota generate \
  -l java \
  -d specs/sell_account_v2_oas3.yaml \
  -c SellAccountV2ApiClient \
  -n com.ebay.accountmanagement.generated.sellaccountv2 \
  -o src/main/java/com/ebay/accountmanagement/generated/sellaccountv2 \
  --ebc --co

# Generate from sell_finances_v1_oas3.yaml
echo "Generating SellFinancesV1 API client..."
kiota generate \
  -l java \
  -d specs/sell_finances_v1_oas3.yaml \
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
