/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.erkoristhein.mailchimp.marketing.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.erkoristhein.mailchimp.marketing.model.ResourceLink;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An individual folder listed in the File Manager.
 */
@JsonPropertyOrder({
  GalleryFolder.JSON_PROPERTY_ID,
  GalleryFolder.JSON_PROPERTY_NAME,
  GalleryFolder.JSON_PROPERTY_FILE_COUNT,
  GalleryFolder.JSON_PROPERTY_CREATED_AT,
  GalleryFolder.JSON_PROPERTY_CREATED_BY,
  GalleryFolder.JSON_PROPERTY_LINKS
})
@JsonTypeName("Gallery_Folder")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T16:39:59.516441+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class GalleryFolder {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FILE_COUNT = "file_count";
  private Integer fileCount;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private List<ResourceLink> links = new ArrayList<>();

  public GalleryFolder() {
  }

  @JsonCreator
  public GalleryFolder(
    @JsonProperty(JSON_PROPERTY_ID) Integer id, 
    @JsonProperty(JSON_PROPERTY_FILE_COUNT) Integer fileCount, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_LINKS) List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.fileCount = fileCount;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.links = links;
  }

   /**
   * The unique id for the folder.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }




  public GalleryFolder name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the folder.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


   /**
   * The number of files in the folder.
   * @return fileCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileCount() {
    return fileCount;
  }




   /**
   * The date and time a file was added to the File Manager in ISO 8601 format.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The username of the profile that created the folder.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * A list of link types and descriptions for the API schema documents.
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceLink> getLinks() {
    return links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GalleryFolder galleryFolder = (GalleryFolder) o;
    return Objects.equals(this.id, galleryFolder.id) &&
        Objects.equals(this.name, galleryFolder.name) &&
        Objects.equals(this.fileCount, galleryFolder.fileCount) &&
        Objects.equals(this.createdAt, galleryFolder.createdAt) &&
        Objects.equals(this.createdBy, galleryFolder.createdBy) &&
        Objects.equals(this.links, galleryFolder.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fileCount, createdAt, createdBy, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GalleryFolder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

