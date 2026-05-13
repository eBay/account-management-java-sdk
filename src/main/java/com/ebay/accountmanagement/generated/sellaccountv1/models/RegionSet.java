package com.ebay.accountmanagement.generated.sellaccountv1.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type consists of the &lt;b&gt;regionIncluded&lt;/b&gt; and &lt;b&gt;regionExcluded&lt;/b&gt; arrays, which indicate the areas to where the seller does and doesn&apos;t ship.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegionSet implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of one or more &lt;b&gt;regionName&lt;/b&gt; values that specify the areas to where a seller does not ship. A &lt;b&gt;regionExcluded&lt;/b&gt; list should only be set in the top-level &lt;b&gt;shipToLocations&lt;/b&gt; container and not within the &lt;b&gt;shippingServices.shipToLocations&lt;/b&gt; container used to specify which shipping regions are serviced by each available shipping service option. &lt;p&gt;Many sellers are willing to ship to many international locations, but they may want to exclude some world regions or some countries as places they are willing to ship to.&lt;br&gt;&lt;br&gt;This array will be returned as empty if no shipping regions are excluded with the fulfillment business policy.&lt;br&gt; &lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; The &lt;b&gt;regionExcluded&lt;/b&gt; array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a &lt;b&gt;createFulfillmentPolicy&lt;/b&gt; or &lt;b&gt;updateFulfillmentPolicy&lt;/b&gt; request, it will be ignored.&lt;/span&gt;
     */
    private java.util.List<Region> regionExcluded;
    /**
     * An array of one or more &lt;b&gt;regionName&lt;/b&gt; fields that specify the areas to where a seller ships. &lt;br&gt;Each eBay marketplace supports its own set of allowable shipping locations.&lt;br&gt; &lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; The &lt;b&gt;regionIncluded&lt;/b&gt; array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a &lt;b&gt;createFulfillmentPolicy&lt;/b&gt; or &lt;b&gt;updateFulfillmentPolicy&lt;/b&gt; request, it will be ignored.&lt;/span&gt;
     */
    private java.util.List<Region> regionIncluded;
    /**
     * Instantiates a new {@link RegionSet} and sets the default values.
     */
    public RegionSet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegionSet}
     */
    @jakarta.annotation.Nonnull
    public static RegionSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionSet();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("regionExcluded", (n) -> { this.setRegionExcluded(n.getCollectionOfObjectValues(Region::createFromDiscriminatorValue)); });
        deserializerMap.put("regionIncluded", (n) -> { this.setRegionIncluded(n.getCollectionOfObjectValues(Region::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the regionExcluded property value. An array of one or more &lt;b&gt;regionName&lt;/b&gt; values that specify the areas to where a seller does not ship. A &lt;b&gt;regionExcluded&lt;/b&gt; list should only be set in the top-level &lt;b&gt;shipToLocations&lt;/b&gt; container and not within the &lt;b&gt;shippingServices.shipToLocations&lt;/b&gt; container used to specify which shipping regions are serviced by each available shipping service option. &lt;p&gt;Many sellers are willing to ship to many international locations, but they may want to exclude some world regions or some countries as places they are willing to ship to.&lt;br&gt;&lt;br&gt;This array will be returned as empty if no shipping regions are excluded with the fulfillment business policy.&lt;br&gt; &lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; The &lt;b&gt;regionExcluded&lt;/b&gt; array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a &lt;b&gt;createFulfillmentPolicy&lt;/b&gt; or &lt;b&gt;updateFulfillmentPolicy&lt;/b&gt; request, it will be ignored.&lt;/span&gt;
     * @return a {@link java.util.List<Region>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Region> getRegionExcluded() {
        return this.regionExcluded;
    }
    /**
     * Gets the regionIncluded property value. An array of one or more &lt;b&gt;regionName&lt;/b&gt; fields that specify the areas to where a seller ships. &lt;br&gt;Each eBay marketplace supports its own set of allowable shipping locations.&lt;br&gt; &lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; The &lt;b&gt;regionIncluded&lt;/b&gt; array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a &lt;b&gt;createFulfillmentPolicy&lt;/b&gt; or &lt;b&gt;updateFulfillmentPolicy&lt;/b&gt; request, it will be ignored.&lt;/span&gt;
     * @return a {@link java.util.List<Region>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Region> getRegionIncluded() {
        return this.regionIncluded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("regionExcluded", this.getRegionExcluded());
        writer.writeCollectionOfObjectValues("regionIncluded", this.getRegionIncluded());
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
     * Sets the regionExcluded property value. An array of one or more &lt;b&gt;regionName&lt;/b&gt; values that specify the areas to where a seller does not ship. A &lt;b&gt;regionExcluded&lt;/b&gt; list should only be set in the top-level &lt;b&gt;shipToLocations&lt;/b&gt; container and not within the &lt;b&gt;shippingServices.shipToLocations&lt;/b&gt; container used to specify which shipping regions are serviced by each available shipping service option. &lt;p&gt;Many sellers are willing to ship to many international locations, but they may want to exclude some world regions or some countries as places they are willing to ship to.&lt;br&gt;&lt;br&gt;This array will be returned as empty if no shipping regions are excluded with the fulfillment business policy.&lt;br&gt; &lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; The &lt;b&gt;regionExcluded&lt;/b&gt; array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a &lt;b&gt;createFulfillmentPolicy&lt;/b&gt; or &lt;b&gt;updateFulfillmentPolicy&lt;/b&gt; request, it will be ignored.&lt;/span&gt;
     * @param value Value to set for the regionExcluded property.
     */
    public void setRegionExcluded(@jakarta.annotation.Nullable final java.util.List<Region> value) {
        this.regionExcluded = value;
    }
    /**
     * Sets the regionIncluded property value. An array of one or more &lt;b&gt;regionName&lt;/b&gt; fields that specify the areas to where a seller ships. &lt;br&gt;Each eBay marketplace supports its own set of allowable shipping locations.&lt;br&gt; &lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt; The &lt;b&gt;regionIncluded&lt;/b&gt; array is not applicable for motor vehicle business policies on the US, CA, or UK marketplaces. If this array is used in a &lt;b&gt;createFulfillmentPolicy&lt;/b&gt; or &lt;b&gt;updateFulfillmentPolicy&lt;/b&gt; request, it will be ignored.&lt;/span&gt;
     * @param value Value to set for the regionIncluded property.
     */
    public void setRegionIncluded(@jakarta.annotation.Nullable final java.util.List<Region> value) {
        this.regionIncluded = value;
    }
}
