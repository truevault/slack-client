package com.hubspot.slack.client.methods.params.conversations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.methods.TimeIntervalFilter;
import com.hubspot.slack.client.methods.interceptor.HasChannel;
import org.immutables.value.Value.Immutable;

import java.util.Optional;

@Immutable
@HubSpotStyle
public abstract class AbstractConversationRepliesPagedParams implements HasChannel, TimeIntervalFilter {
  @JsonProperty("channel")
  public abstract String getChannelId();

  @JsonProperty("ts")
  public abstract String getThreadTs();

  public abstract Optional<String> getCursor();
  public abstract Optional<Integer> getLimit();
}
