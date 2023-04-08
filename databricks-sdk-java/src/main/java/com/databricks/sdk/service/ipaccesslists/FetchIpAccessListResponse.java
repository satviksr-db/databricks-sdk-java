// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class FetchIpAccessListResponse {
  /** */
  @JsonProperty("ip_access_list")
  private IpAccessListInfo ipAccessList;

  public FetchIpAccessListResponse setIpAccessList(IpAccessListInfo ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessListInfo getIpAccessList() {
    return ipAccessList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FetchIpAccessListResponse that = (FetchIpAccessListResponse) o;
    return Objects.equals(ipAccessList, that.ipAccessList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessList);
  }

  @Override
  public String toString() {
    return new ToStringer(FetchIpAccessListResponse.class)
        .add("ipAccessList", ipAccessList)
        .toString();
  }
}
