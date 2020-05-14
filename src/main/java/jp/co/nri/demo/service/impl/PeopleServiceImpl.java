package jp.co.nri.demo.service.impl;

import jp.co.nri.demo.dao.PeopleDao;
import jp.co.nri.demo.model.PeopleModel;
import jp.co.nri.demo.service.peopleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeopleServiceImpl implements peopleservice {
    @Autowired
    PeopleDao peopleDao;

    @Override
    public List<PeopleModel> selectPeoples() {
        List<PeopleModel> select = peopleDao.select();
        return select;
    }

    @Override
    public PeopleModel selectPeopleById(int id) {
        PeopleModel select = peopleDao.selectByID(id);
        return select;
    }

}
