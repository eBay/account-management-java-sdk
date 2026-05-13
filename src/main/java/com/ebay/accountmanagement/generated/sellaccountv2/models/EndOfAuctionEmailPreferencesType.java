package com.ebay.accountmanagement.generated.sellaccountv2.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This container shows the seller&apos;s preferences for the end-of-auction email sent to the winning bidder.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndOfAuctionEmailPreferencesType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This boolean field indicates whether or not the seller is using a customized email to send to winning bidders.
     */
    private Boolean emailCustomized;
    /**
     * This boolean field indicates whether or not the seller is using a customized logo in the emails that are sent to winning bidders.
     */
    private Boolean logoCustomized;
    /**
     * This enum indicates the type of logo that is used in the email that is sent to winning bidders. See EndOfAuctionLogoTypeEnum type for descriptions of the different logo types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:EndOfAuctionLogoTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String logoType;
    /**
     * This field shows the URL path to a sellers custom logo image that is being used in the email sent to winning bidders. This field is only returned if the seller is using a customized logo in emails.
     */
    private String logoUrl;
    /**
     * This field shows the body text that is being used if the seller is sending customized emails to winning bidders. The template text has a maximum limit  of 1000 characters.
     */
    private String templateText;
    /**
     * This boolean field indicates whether or not the seller is using customized text in the emails that are sent to winning bidders.
     */
    private Boolean textCustomized;
    /**
     * Instantiates a new {@link EndOfAuctionEmailPreferencesType} and sets the default values.
     */
    public EndOfAuctionEmailPreferencesType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EndOfAuctionEmailPreferencesType}
     */
    @jakarta.annotation.Nonnull
    public static EndOfAuctionEmailPreferencesType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndOfAuctionEmailPreferencesType();
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
     * Gets the emailCustomized property value. This boolean field indicates whether or not the seller is using a customized email to send to winning bidders.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmailCustomized() {
        return this.emailCustomized;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("emailCustomized", (n) -> { this.setEmailCustomized(n.getBooleanValue()); });
        deserializerMap.put("logoCustomized", (n) -> { this.setLogoCustomized(n.getBooleanValue()); });
        deserializerMap.put("logoType", (n) -> { this.setLogoType(n.getStringValue()); });
        deserializerMap.put("logoUrl", (n) -> { this.setLogoUrl(n.getStringValue()); });
        deserializerMap.put("templateText", (n) -> { this.setTemplateText(n.getStringValue()); });
        deserializerMap.put("textCustomized", (n) -> { this.setTextCustomized(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the logoCustomized property value. This boolean field indicates whether or not the seller is using a customized logo in the emails that are sent to winning bidders.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLogoCustomized() {
        return this.logoCustomized;
    }
    /**
     * Gets the logoType property value. This enum indicates the type of logo that is used in the email that is sent to winning bidders. See EndOfAuctionLogoTypeEnum type for descriptions of the different logo types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:EndOfAuctionLogoTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogoType() {
        return this.logoType;
    }
    /**
     * Gets the logoUrl property value. This field shows the URL path to a sellers custom logo image that is being used in the email sent to winning bidders. This field is only returned if the seller is using a customized logo in emails.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogoUrl() {
        return this.logoUrl;
    }
    /**
     * Gets the templateText property value. This field shows the body text that is being used if the seller is sending customized emails to winning bidders. The template text has a maximum limit  of 1000 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemplateText() {
        return this.templateText;
    }
    /**
     * Gets the textCustomized property value. This boolean field indicates whether or not the seller is using customized text in the emails that are sent to winning bidders.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTextCustomized() {
        return this.textCustomized;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("emailCustomized", this.getEmailCustomized());
        writer.writeBooleanValue("logoCustomized", this.getLogoCustomized());
        writer.writeStringValue("logoType", this.getLogoType());
        writer.writeStringValue("logoUrl", this.getLogoUrl());
        writer.writeStringValue("templateText", this.getTemplateText());
        writer.writeBooleanValue("textCustomized", this.getTextCustomized());
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
     * Sets the emailCustomized property value. This boolean field indicates whether or not the seller is using a customized email to send to winning bidders.
     * @param value Value to set for the emailCustomized property.
     */
    public void setEmailCustomized(@jakarta.annotation.Nullable final Boolean value) {
        this.emailCustomized = value;
    }
    /**
     * Sets the logoCustomized property value. This boolean field indicates whether or not the seller is using a customized logo in the emails that are sent to winning bidders.
     * @param value Value to set for the logoCustomized property.
     */
    public void setLogoCustomized(@jakarta.annotation.Nullable final Boolean value) {
        this.logoCustomized = value;
    }
    /**
     * Sets the logoType property value. This enum indicates the type of logo that is used in the email that is sent to winning bidders. See EndOfAuctionLogoTypeEnum type for descriptions of the different logo types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:EndOfAuctionLogoTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the logoType property.
     */
    public void setLogoType(@jakarta.annotation.Nullable final String value) {
        this.logoType = value;
    }
    /**
     * Sets the logoUrl property value. This field shows the URL path to a sellers custom logo image that is being used in the email sent to winning bidders. This field is only returned if the seller is using a customized logo in emails.
     * @param value Value to set for the logoUrl property.
     */
    public void setLogoUrl(@jakarta.annotation.Nullable final String value) {
        this.logoUrl = value;
    }
    /**
     * Sets the templateText property value. This field shows the body text that is being used if the seller is sending customized emails to winning bidders. The template text has a maximum limit  of 1000 characters.
     * @param value Value to set for the templateText property.
     */
    public void setTemplateText(@jakarta.annotation.Nullable final String value) {
        this.templateText = value;
    }
    /**
     * Sets the textCustomized property value. This boolean field indicates whether or not the seller is using customized text in the emails that are sent to winning bidders.
     * @param value Value to set for the textCustomized property.
     */
    public void setTextCustomized(@jakarta.annotation.Nullable final Boolean value) {
        this.textCustomized = value;
    }
}
