package com.hubspot.slack.client.models.response.conversations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.slack.client.models.response.SlackResponse;
import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.LiteMessage;

@Immutable
@HubSpotStyle
public interface ConversationsRepliesResponseIF extends SlackResponse {
    List<LiteMessage> getMessages();

    @JsonProperty("has_more")
    boolean hasMore();
}
