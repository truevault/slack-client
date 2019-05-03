package com.hubspot.slack.client.models.response.files;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.files.SlackFile;
import com.hubspot.slack.client.models.response.Paging;
import com.hubspot.slack.client.models.response.SlackResponse;
import com.hubspot.slack.client.models.users.SlackUser;
import org.immutables.value.Value.Immutable;

import java.util.List;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
public interface FilesListResponseIF extends SlackResponse {
  Paging getPaging();
  List<SlackFile> getFiles();
}
