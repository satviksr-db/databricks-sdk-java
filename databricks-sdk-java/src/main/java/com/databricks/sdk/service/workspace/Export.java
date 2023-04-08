// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Export a notebook */
public class Export {
  /**
   * Flag to enable direct download. If it is `true`, the response will be the exported file itself.
   * Otherwise, the response contains content as base64 encoded string.
   */
  @QueryParam("direct_download")
  private Boolean directDownload;

  /**
   * This specifies the format of the exported file. By default, this is `SOURCE`. However it may be
   * one of: `SOURCE`, `HTML`, `JUPYTER`, `DBC`.
   *
   * <p>The value is case sensitive.
   */
  @QueryParam("format")
  private ExportFormat format;

  /**
   * The absolute path of the notebook or directory. Exporting directory is only support for `DBC`
   * format.
   */
  @QueryParam("path")
  private String path;

  public Export setDirectDownload(Boolean directDownload) {
    this.directDownload = directDownload;
    return this;
  }

  public Boolean getDirectDownload() {
    return directDownload;
  }

  public Export setFormat(ExportFormat format) {
    this.format = format;
    return this;
  }

  public ExportFormat getFormat() {
    return format;
  }

  public Export setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Export that = (Export) o;
    return Objects.equals(directDownload, that.directDownload)
        && Objects.equals(format, that.format)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDownload, format, path);
  }

  @Override
  public String toString() {
    return new ToStringer(Export.class)
        .add("directDownload", directDownload)
        .add("format", format)
        .add("path", path)
        .toString();
  }
}
