package cn.fhjt.weixin.service.imp;

import cn.fhjt.weixin.mapper.TbNewPicMapper;
import cn.fhjt.weixin.pojo.TbNewPic;
import cn.fhjt.weixin.service.TbNewPicService;
import cn.fhjt.weixin.utils.CustomerContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbNewPicServiceImpl implements TbNewPicService {
    @Autowired
    private TbNewPicMapper tbNewPicMapper;
    @Override
    public void add(TbNewPic tbNewPic) {
        CustomerContextHolder.setCustomerType(CustomerContextHolder.DATA_SOURCE_MYSQL);
        tbNewPicMapper.insert(tbNewPic);
    }
}
