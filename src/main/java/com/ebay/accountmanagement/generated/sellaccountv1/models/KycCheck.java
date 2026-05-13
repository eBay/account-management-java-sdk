package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to provide details about any KYC check that is applicable to the managed payments seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KycCheck implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field gives a short summary of what is required from the seller. An example might be, &apos;&lt;code&gt;Upload bank document now.&lt;/code&gt;&apos;. The &lt;b&gt;detailMessage&lt;/b&gt; field will often provide more details on what is required of the seller.
     */
    private String alert;
    /**
     * The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the &lt;b&gt;detailMessage&lt;/b&gt; and other applicable, corresponding fields. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String dataRequired;
    /**
     * This field gives a detailed message about what is required from the seller. An example might be, &apos;&lt;code&gt;Please upload a bank document by 2020-08-01 to get your account back in good standing.&lt;/code&gt;&apos;.
     */
    private String detailMessage;
    /**
     * The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.&lt;br&gt;&lt;br&gt;The timestamp in this field uses the UTC date and time format described in the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601 Standard&lt;/a&gt;. See below for this format and an example: &lt;br&gt;&lt;br&gt;&lt;i&gt;MM-DD-YYYY HH:MM:SS&lt;/i&gt;&lt;br/&gt;&lt;code&gt;06-05-2020 10:34:18&lt;/code&gt;
     */
    private String dueDate;
    /**
     * If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.
     */
    private String remedyUrl;
    /**
     * Instantiates a new {@link KycCheck} and sets the default values.
     */
    public KycCheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link KycCheck}
     */
    @jakarta.annotation.Nonnull
    public static KycCheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KycCheck();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the alert property value. This field gives a short summary of what is required from the seller. An example might be, &apos;&lt;code&gt;Upload bank document now.&lt;/code&gt;&apos;. The &lt;b&gt;detailMessage&lt;/b&gt; field will often provide more details on what is required of the seller.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlert() {
        return this.alert;
    }
    /**
     * Gets the dataRequired property value. The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the &lt;b&gt;detailMessage&lt;/b&gt; and other applicable, corresponding fields. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataRequired() {
        return this.dataRequired;
    }
    /**
     * Gets the detailMessage property value. This field gives a detailed message about what is required from the seller. An example might be, &apos;&lt;code&gt;Please upload a bank document by 2020-08-01 to get your account back in good standing.&lt;/code&gt;&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetailMessage() {
        return this.detailMessage;
    }
    /**
     * Gets the dueDate property value. The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.&lt;br&gt;&lt;br&gt;The timestamp in this field uses the UTC date and time format described in the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601 Standard&lt;/a&gt;. See below for this format and an example: &lt;br&gt;&lt;br&gt;&lt;i&gt;MM-DD-YYYY HH:MM:SS&lt;/i&gt;&lt;br/&gt;&lt;code&gt;06-05-2020 10:34:18&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDueDate() {
        return this.dueDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("alert", (n) -> { this.setAlert(n.getStringValue()); });
        deserializerMap.put("dataRequired", (n) -> { this.setDataRequired(n.getStringValue()); });
        deserializerMap.put("detailMessage", (n) -> { this.setDetailMessage(n.getStringValue()); });
        deserializerMap.put("dueDate", (n) -> { this.setDueDate(n.getStringValue()); });
        deserializerMap.put("remedyUrl", (n) -> { this.setRemedyUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the remedyUrl property value. If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemedyUrl() {
        return this.remedyUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alert", this.getAlert());
        writer.writeStringValue("dataRequired", this.getDataRequired());
        writer.writeStringValue("detailMessage", this.getDetailMessage());
        writer.writeStringValue("dueDate", this.getDueDate());
        writer.writeStringValue("remedyUrl", this.getRemedyUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alert property value. This field gives a short summary of what is required from the seller. An example might be, &apos;&lt;code&gt;Upload bank document now.&lt;/code&gt;&apos;. The &lt;b&gt;detailMessage&lt;/b&gt; field will often provide more details on what is required of the seller.
     * @param value Value to set for the alert property.
     */
    public void setAlert(@jakarta.annotation.Nullable final String value) {
        this.alert = value;
    }
    /**
     * Sets the dataRequired property value. The enumeration value returned in this field categorizes the type of details needed for the KYC check. More information about the check is shown in the &lt;b&gt;detailMessage&lt;/b&gt; and other applicable, corresponding fields. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/kyc:DetailsType&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the dataRequired property.
     */
    public void setDataRequired(@jakarta.annotation.Nullable final String value) {
        this.dataRequired = value;
    }
    /**
     * Sets the detailMessage property value. This field gives a detailed message about what is required from the seller. An example might be, &apos;&lt;code&gt;Please upload a bank document by 2020-08-01 to get your account back in good standing.&lt;/code&gt;&apos;.
     * @param value Value to set for the detailMessage property.
     */
    public void setDetailMessage(@jakarta.annotation.Nullable final String value) {
        this.detailMessage = value;
    }
    /**
     * Sets the dueDate property value. The timestamp in this field indicates the date by which the seller should resolve the KYC requirement.&lt;br&gt;&lt;br&gt;The timestamp in this field uses the UTC date and time format described in the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; target=&quot;_blank&quot;&gt;ISO 8601 Standard&lt;/a&gt;. See below for this format and an example: &lt;br&gt;&lt;br&gt;&lt;i&gt;MM-DD-YYYY HH:MM:SS&lt;/i&gt;&lt;br/&gt;&lt;code&gt;06-05-2020 10:34:18&lt;/code&gt;
     * @param value Value to set for the dueDate property.
     */
    public void setDueDate(@jakarta.annotation.Nullable final String value) {
        this.dueDate = value;
    }
    /**
     * Sets the remedyUrl property value. If applicable and available, a URL will be returned in this field, and the link will take the seller to an eBay page where they can provide the requested information.
     * @param value Value to set for the remedyUrl property.
     */
    public void setRemedyUrl(@jakarta.annotation.Nullable final String value) {
        this.remedyUrl = value;
    }
}
