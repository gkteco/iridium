/*
 *  Copyright (C) Josh Fischer - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by Josh Fischer <josh@joshfischer.io>, 2023.
 */
package software.iridium.api.email.domain;

import java.io.Serializable;

public class EmailSendResponse implements Serializable {
  private static final long serialVersionUID = -4266326726587599134L;
  public static final String MEDIA_TYPE = "application/vnd.iridium.id.email-send-response.1+json";
}