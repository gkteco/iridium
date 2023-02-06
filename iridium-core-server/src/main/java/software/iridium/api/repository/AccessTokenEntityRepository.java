/*
 *  Copyright (C) Josh Fischer - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by Josh Fischer <josh@joshfischer.io>, 2023.
 */
package software.iridium.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import software.iridium.api.entity.AccessTokenEntity;

public interface AccessTokenEntityRepository extends JpaRepository<AccessTokenEntity, String> {
  // intentionally left blank
}