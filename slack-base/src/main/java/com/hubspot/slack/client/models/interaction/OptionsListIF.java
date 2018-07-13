package com.hubspot.slack.client.models.interaction;

import java.util.List;

import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.SlackOption;

@Immutable
@HubSpotStyle
public interface OptionsListIF {
  List<SlackOption> getOptions();
}
