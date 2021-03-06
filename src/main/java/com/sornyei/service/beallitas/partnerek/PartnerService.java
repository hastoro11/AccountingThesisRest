package com.sornyei.service.beallitas.partnerek;

import com.sornyei.model.Partner;

import java.util.List;

/**
 * Created by gaborsornyei on 05/08/15.
 */
public interface PartnerService {

	List<Partner> findAll();

	Partner findById(int id);

	Partner update(Partner partner);

	Partner create(Partner partner);

	boolean delete(int id);
}
