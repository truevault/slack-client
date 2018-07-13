package com.hubspot.slack.client.models.actions;

import java.util.Optional;

import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.SlackOptionIF;

@Immutable
@HubSpotStyle
public interface OptionIF extends SlackOptionIF {
  Optional<String> getText();
}

