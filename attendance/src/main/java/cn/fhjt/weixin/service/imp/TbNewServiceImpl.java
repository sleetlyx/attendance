package cn.fhjt.weixin.service.imp;

import cn.fhjt.weixin.mapper.TbNewMapper;
import cn.fhjt.weixin.pojo.TbNew;
import cn.fhjt.weixin.pojo.TbNewExample;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.pojo.entity.Result;
import cn.fhjt.weixin.service.TbNewService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TbNewServiceImpl implements TbNewService {
    @Autowired
    private TbNewMapper tbNewMapper;

    /**
     * 增加
     */
    @Override
    public void add(TbNew tbNew) {
        tbNewMapper.insert(tbNew);
    }


    /**
     * 修改
     */
    @Override
    public void update(TbNew tbNew) {
        tbNewMapper.updateByPrimaryKey(tbNew);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbNew findOne(Long id) {
        return tbNewMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            tbNewMapper.deleteByPrimaryKey(id);
        }
    }


    @Override
    public PageResult findPage(TbNew tbNew, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbNewExample example = new TbNewExample();
        TbNewExample.Criteria criteria = example.createCriteria();

        if (tbNew != null) {


        }

        Page<TbNew> page = (Page<TbNew>) tbNewMapper.selectByExample(example);
        List<TbNew> result = page.getResult();

        return new PageResult(page.getTotal(), result);
    }

    @Override
    public void updateByIds(Long[] ids) {
        for (Long tbNewId : ids) {
            TbNew tbUser = tbNewMapper.selectByPrimaryKey(tbNewId);

            tbNewMapper.updateByPrimaryKeySelective(tbUser);
        }
    }

    @Override
    public List<TbNew> findByType(String newType) {
        TbNewExample example = new TbNewExample();
        example.setOrderByClause("id desc");
        example.createCriteria().andTypeEqualTo(newType);
        if(newType.equals("新闻") || newType.equals("公告")){
           PageHelper.startPage(1,6);
           Page<TbNew>  page = (Page<TbNew>) tbNewMapper.selectByExample(example);
           return page.getResult();
        }
        else {
            PageHelper.startPage(1,4);
            Page<TbNew>  page = (Page<TbNew>) tbNewMapper.selectByExample(example);
            return page.getResult();
        }

    }


}
