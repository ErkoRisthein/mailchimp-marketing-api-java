/*
 * Mailchimp Marketing API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.81
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Options for customizing your signup form header.
 */
@JsonPropertyOrder({
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_URL,
  SignupFormHeaderOptions.JSON_PROPERTY_TEXT,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_WIDTH,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_HEIGHT,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_ALT,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_LINK,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_ALIGN,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_BORDER_WIDTH,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_BORDER_STYLE,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_BORDER_COLOR,
  SignupFormHeaderOptions.JSON_PROPERTY_IMAGE_TARGET
})
@JsonTypeName("Signup_form_header_options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-03T13:08:30.305646+02:00[Europe/Tallinn]")
public class SignupFormHeaderOptions {
  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private String imageUrl;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_IMAGE_WIDTH = "image_width";
  private String imageWidth;

  public static final String JSON_PROPERTY_IMAGE_HEIGHT = "image_height";
  private String imageHeight;

  public static final String JSON_PROPERTY_IMAGE_ALT = "image_alt";
  private String imageAlt;

  public static final String JSON_PROPERTY_IMAGE_LINK = "image_link";
  private String imageLink;

  /**
   * Image alignment.
   */
  public enum ImageAlignEnum {
    NONE("none"),
    
    LEFT("left"),
    
    CENTER("center"),
    
    RIGHT("right");

    private String value;

    ImageAlignEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImageAlignEnum fromValue(String value) {
      for (ImageAlignEnum b : ImageAlignEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IMAGE_ALIGN = "image_align";
  private ImageAlignEnum imageAlign;

  public static final String JSON_PROPERTY_IMAGE_BORDER_WIDTH = "image_border_width";
  private String imageBorderWidth;

  /**
   * Image border style.
   */
  public enum ImageBorderStyleEnum {
    NONE("none"),
    
    SOLID("solid"),
    
    DOTTED("dotted"),
    
    DASHED("dashed"),
    
    DOUBLE("double"),
    
    GROOVE("groove"),
    
    OUTSET("outset"),
    
    INSET("inset"),
    
    RIDGE("ridge");

    private String value;

    ImageBorderStyleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImageBorderStyleEnum fromValue(String value) {
      for (ImageBorderStyleEnum b : ImageBorderStyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IMAGE_BORDER_STYLE = "image_border_style";
  private ImageBorderStyleEnum imageBorderStyle;

  public static final String JSON_PROPERTY_IMAGE_BORDER_COLOR = "image_border_color";
  private String imageBorderColor;

  /**
   * Image link target.
   */
  public enum ImageTargetEnum {
    _BLANK("_blank"),
    
    NULL("null");

    private String value;

    ImageTargetEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImageTargetEnum fromValue(String value) {
      for (ImageTargetEnum b : ImageTargetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IMAGE_TARGET = "image_target";
  private ImageTargetEnum imageTarget;

  public SignupFormHeaderOptions() {
  }

  public SignupFormHeaderOptions imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Header image URL.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public SignupFormHeaderOptions text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Header text.
   * @return text
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public SignupFormHeaderOptions imageWidth(String imageWidth) {
    
    this.imageWidth = imageWidth;
    return this;
  }

   /**
   * Image width, in pixels.
   * @return imageWidth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageWidth() {
    return imageWidth;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageWidth(String imageWidth) {
    this.imageWidth = imageWidth;
  }


  public SignupFormHeaderOptions imageHeight(String imageHeight) {
    
    this.imageHeight = imageHeight;
    return this;
  }

   /**
   * Image height, in pixels.
   * @return imageHeight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageHeight() {
    return imageHeight;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageHeight(String imageHeight) {
    this.imageHeight = imageHeight;
  }


  public SignupFormHeaderOptions imageAlt(String imageAlt) {
    
    this.imageAlt = imageAlt;
    return this;
  }

   /**
   * Alt text for the image.
   * @return imageAlt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_ALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageAlt() {
    return imageAlt;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_ALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageAlt(String imageAlt) {
    this.imageAlt = imageAlt;
  }


  public SignupFormHeaderOptions imageLink(String imageLink) {
    
    this.imageLink = imageLink;
    return this;
  }

   /**
   * The URL that the header image will link to.
   * @return imageLink
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageLink() {
    return imageLink;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }


  public SignupFormHeaderOptions imageAlign(ImageAlignEnum imageAlign) {
    
    this.imageAlign = imageAlign;
    return this;
  }

   /**
   * Image alignment.
   * @return imageAlign
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImageAlignEnum getImageAlign() {
    return imageAlign;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageAlign(ImageAlignEnum imageAlign) {
    this.imageAlign = imageAlign;
  }


  public SignupFormHeaderOptions imageBorderWidth(String imageBorderWidth) {
    
    this.imageBorderWidth = imageBorderWidth;
    return this;
  }

   /**
   * Image border width.
   * @return imageBorderWidth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_BORDER_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageBorderWidth() {
    return imageBorderWidth;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_BORDER_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageBorderWidth(String imageBorderWidth) {
    this.imageBorderWidth = imageBorderWidth;
  }


  public SignupFormHeaderOptions imageBorderStyle(ImageBorderStyleEnum imageBorderStyle) {
    
    this.imageBorderStyle = imageBorderStyle;
    return this;
  }

   /**
   * Image border style.
   * @return imageBorderStyle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_BORDER_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImageBorderStyleEnum getImageBorderStyle() {
    return imageBorderStyle;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_BORDER_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageBorderStyle(ImageBorderStyleEnum imageBorderStyle) {
    this.imageBorderStyle = imageBorderStyle;
  }


  public SignupFormHeaderOptions imageBorderColor(String imageBorderColor) {
    
    this.imageBorderColor = imageBorderColor;
    return this;
  }

   /**
   * Image border color.
   * @return imageBorderColor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageBorderColor() {
    return imageBorderColor;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageBorderColor(String imageBorderColor) {
    this.imageBorderColor = imageBorderColor;
  }


  public SignupFormHeaderOptions imageTarget(ImageTargetEnum imageTarget) {
    
    this.imageTarget = imageTarget;
    return this;
  }

   /**
   * Image link target.
   * @return imageTarget
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImageTargetEnum getImageTarget() {
    return imageTarget;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageTarget(ImageTargetEnum imageTarget) {
    this.imageTarget = imageTarget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupFormHeaderOptions signupFormHeaderOptions = (SignupFormHeaderOptions) o;
    return Objects.equals(this.imageUrl, signupFormHeaderOptions.imageUrl) &&
        Objects.equals(this.text, signupFormHeaderOptions.text) &&
        Objects.equals(this.imageWidth, signupFormHeaderOptions.imageWidth) &&
        Objects.equals(this.imageHeight, signupFormHeaderOptions.imageHeight) &&
        Objects.equals(this.imageAlt, signupFormHeaderOptions.imageAlt) &&
        Objects.equals(this.imageLink, signupFormHeaderOptions.imageLink) &&
        Objects.equals(this.imageAlign, signupFormHeaderOptions.imageAlign) &&
        Objects.equals(this.imageBorderWidth, signupFormHeaderOptions.imageBorderWidth) &&
        Objects.equals(this.imageBorderStyle, signupFormHeaderOptions.imageBorderStyle) &&
        Objects.equals(this.imageBorderColor, signupFormHeaderOptions.imageBorderColor) &&
        Objects.equals(this.imageTarget, signupFormHeaderOptions.imageTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, text, imageWidth, imageHeight, imageAlt, imageLink, imageAlign, imageBorderWidth, imageBorderStyle, imageBorderColor, imageTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupFormHeaderOptions {\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    imageAlt: ").append(toIndentedString(imageAlt)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    imageAlign: ").append(toIndentedString(imageAlign)).append("\n");
    sb.append("    imageBorderWidth: ").append(toIndentedString(imageBorderWidth)).append("\n");
    sb.append("    imageBorderStyle: ").append(toIndentedString(imageBorderStyle)).append("\n");
    sb.append("    imageBorderColor: ").append(toIndentedString(imageBorderColor)).append("\n");
    sb.append("    imageTarget: ").append(toIndentedString(imageTarget)).append("\n");
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

