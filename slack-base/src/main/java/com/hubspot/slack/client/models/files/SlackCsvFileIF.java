package com.hubspot.slack.client.models.files;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value.Immutable;

import java.util.Optional;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface SlackCsvFileIF extends SlackTextFileCore {
  @Override
  default Optional<String> getFiletype() {
    return Optional.ofNullable(SlackFileType.CSV.type);
  }
}
