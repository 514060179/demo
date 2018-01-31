package com.simon.dubbo.demo;

import java.util.List;

/**
 * Created by Administrator on 2018/1/29.
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
