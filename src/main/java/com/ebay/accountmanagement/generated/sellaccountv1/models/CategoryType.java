package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The category type discerns whether the policy applies to motor vehicle listings, or to any other items except motor vehicle listings. &lt;br&gt;&lt;br&gt;Each business policy can be associated with either or both categories (&apos;MOTORS_VEHICLES&apos; and &apos;ALL_EXCLUDING_MOTORS_VEHICLES&apos;); however, return business policies are not applicable for motor vehicle listings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field has been deprecated and is no longer used.&lt;ul&gt;&lt;li&gt;Do not include this field in any &lt;b&gt;create&lt;/b&gt; or &lt;b&gt;update&lt;/b&gt; method.&lt;/li&gt;&lt;li&gt;This field may be returned within the payload of a &lt;b&gt;get&lt;/b&gt; method, but it can be ignored.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     */
    private Boolean defaultEscaped;
    /**
     * The category type to which the policy applies (motor vehicles or non-motor vehicles). &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt; category type is not valid for return policies. eBay flows do not support the return of motor vehicles.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String name;
    /**
     * Instantiates a new {@link CategoryType} and sets the default values.
     */
    public CategoryType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategoryType}
     */
    @jakarta.annotation.Nonnull
    public static CategoryType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryType();
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
     * Gets the default property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field has been deprecated and is no longer used.&lt;ul&gt;&lt;li&gt;Do not include this field in any &lt;b&gt;create&lt;/b&gt; or &lt;b&gt;update&lt;/b&gt; method.&lt;/li&gt;&lt;li&gt;This field may be returned within the payload of a &lt;b&gt;get&lt;/b&gt; method, but it can be ignored.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDefault() {
        return this.defaultEscaped;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("default", (n) -> { this.setDefault(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The category type to which the policy applies (motor vehicles or non-motor vehicles). &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt; category type is not valid for return policies. eBay flows do not support the return of motor vehicles.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("default", this.getDefault());
        writer.writeStringValue("name", this.getName());
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
     * Sets the default property value. &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field has been deprecated and is no longer used.&lt;ul&gt;&lt;li&gt;Do not include this field in any &lt;b&gt;create&lt;/b&gt; or &lt;b&gt;update&lt;/b&gt; method.&lt;/li&gt;&lt;li&gt;This field may be returned within the payload of a &lt;b&gt;get&lt;/b&gt; method, but it can be ignored.&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @param value Value to set for the default property.
     */
    public void setDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.defaultEscaped = value;
    }
    /**
     * Sets the name property value. The category type to which the policy applies (motor vehicles or non-motor vehicles). &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;code&gt;MOTORS_VEHICLES&lt;/code&gt; category type is not valid for return policies. eBay flows do not support the return of motor vehicles.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}
