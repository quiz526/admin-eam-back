package com.sk.eadmin.biz.service;

import java.util.List;

import com.sk.eadmin.biz.dto.AddCustomerProblemRegistInputDTO;
import com.sk.eadmin.biz.dto.CustomerProblemRegistInputDTO;
import com.sk.eadmin.biz.dto.CustomerProblemRegistMapperOutputDTO;
import com.sk.eadmin.biz.dto.CustomerProblemRegistOutputDTO;
import com.sk.eadmin.biz.dto.ModifyCustomerProblemRegistInputDTO;

public interface CustomerProblemService {
  public List<CustomerProblemRegistOutputDTO> getCustomerProblemRegistList(CustomerProblemRegistInputDTO param);
  public void addCustomerProblemRegist(AddCustomerProblemRegistInputDTO param);
  public void modifyCustomerProblemRegist(Integer registID, ModifyCustomerProblemRegistInputDTO param);
  public boolean deleteCustomerProblemRegist(Integer registID);
  public CustomerProblemRegistMapperOutputDTO getCustomerProblemRegistDetail(Integer registID);
}