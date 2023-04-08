// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get a model version URI */
public class GetModelVersionDownloadUriRequest {
  /** Name of the registered model */
  @QueryParam("name")
  private String name;

  /** Model version number */
  @QueryParam("version")
  private String version;

  public GetModelVersionDownloadUriRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetModelVersionDownloadUriRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionDownloadUriRequest that = (GetModelVersionDownloadUriRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionDownloadUriRequest.class)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
