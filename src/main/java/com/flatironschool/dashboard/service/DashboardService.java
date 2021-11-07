package com.flatironschool.dashboard.service;

import com.flatironschool.dashboard.model.Condenser;
import com.flatironschool.dashboard.model.repository.CondenserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    protected  CondenserRepository condenserRepository;

    public Condenser addCondenser(Condenser newCondenser) {
        return condenserRepository.save(newCondenser);
    }

    public Iterable<Condenser> getAllCondensers() {
        return condenserRepository.findAll();
    }
}
