package jp.co.nri.demo.service;

import jp.co.nri.demo.model.PeopleModel;

import java.util.List;

public interface peopleservice {
    List<PeopleModel> selectPeoples();
    PeopleModel selectPeopleById(int id);
}
