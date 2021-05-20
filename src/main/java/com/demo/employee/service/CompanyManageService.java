package com.demo.employee.service;

import com.demo.employee.company.entity.CompanyEntity;
import com.demo.employee.company.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("companyManageService")
public class CompanyManageService {
    private CompanyService<CompanyEntity> CompanyService;

    @PostMapping("save")
    public int save(CompanyEntity entity) {
        CompanyService.save(entity);
        return entity.getId();
    }

    @PostMapping("removeById")
    public int removeById(Serializable id) {
        return CompanyService.removeById(id);
    }

    @PostMapping("updateById")
    public int updateById(CompanyEntity entity) {
        return CompanyService.updateById(entity);
    }

    @GetMapping("getById")
    public CompanyEntity getById(Integer id) {
        return CompanyService.getById(id);
    }

    @GetMapping("getList")
    public List<CompanyEntity> getList() {
        return CompanyService.getList();
    }
}
