package com.zytiger.apollo.demo.service.dal.local.dao;

import com.zytiger.apollo.demo.service.dal.local.dataobject.TokenDO;
import com.zytiger.apollo.demo.service.dal.local.mapper.TokenDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * The Table TOKEN.
 * TOKEN
 */
@Repository
public class TokenDAO {

    @Autowired
    private TokenDOMapper tokenDOMapper;

    /**
     * desc:insert:TOKEN.<br/>
     * descSql = INSERT INTO TOKEN VALUES
     *
     * @param entity entity
     * @return int
     */
    public int insert(TokenDO entity) {
        return tokenDOMapper.insert(entity);
    }
}
