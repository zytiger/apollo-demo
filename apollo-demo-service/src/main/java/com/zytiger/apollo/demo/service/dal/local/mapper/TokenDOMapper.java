package com.zytiger.apollo.demo.service.dal.local.mapper;

import com.zytiger.apollo.demo.service.dal.local.dataobject.TokenDO;

/**
 * The Table TOKEN.
 * TOKEN
 */
public interface TokenDOMapper {

    /**
     * desc:insert:TOKEN.<br/>
     * descSql = INSERT INTO TOKEN VALUES
     *
     * @param entity entity
     * @return int
     */
    int insert(TokenDO entity);
}
