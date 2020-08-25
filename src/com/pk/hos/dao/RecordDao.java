package com.pk.hos.dao;

import java.util.List;

import com.pk.hos.model.Record;



public interface RecordDao {
	Record find(Record r);
	List<Record> findAll();
	boolean add(Record r);

}
