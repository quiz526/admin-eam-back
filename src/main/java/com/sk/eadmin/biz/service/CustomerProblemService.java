package com.sk.eadmin.biz.service;

import java.util.List;

import com.sk.eadmin.biz.dto.CustomerProblemRegistInputDTO;
import com.sk.eadmin.biz.dto.CustomerProblemRegistOutputDTO;

public interface CustomerProblemService {
  public List<CustomerProblemRegistOutputDTO> getCustomerProblemRegistList(CustomerProblemRegistInputDTO param);
}