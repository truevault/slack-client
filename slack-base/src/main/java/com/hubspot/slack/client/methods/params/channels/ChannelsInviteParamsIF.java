package com.hubspot.slack.client.methods.params.channels;

import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;

@Immutable
@HubSpotStyle
public interface ChannelsInviteParamsIF {
  String getChannel();
  String getUser();
}
