package com.wissensalt.rnd.sbed.so.service;

import com.wissensalt.rnd.sbed.sd.dto.request.RequestRollBackUpdateCartDTO;
import com.wissensalt.rnd.sbed.sd.dto.request.RequestTransactionDTO;
import com.wissensalt.rnd.sbed.sd.dto.request.RequestUpdateEventStateDetailDTO;
import com.wissensalt.rnd.sbed.sd.exception.ServiceException;

/**
 * @author : <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @since : 2019-08-14
 **/
public interface ISagaService {

    void broadcastOrderTransaction(RequestTransactionDTO p_Request) throws ServiceException;

    void updateEventStateDetail(RequestUpdateEventStateDetailDTO p_Request) throws ServiceException;

    void handleRollback(RequestRollBackUpdateCartDTO p_Request) throws ServiceException;
}
