package cn.fhjt.weixin.controller;

import cn.fhjt.weixin.pojo.TbNew;
import cn.fhjt.weixin.pojo.TbNewPic;
import cn.fhjt.weixin.pojo.entity.PageResult;
import cn.fhjt.weixin.pojo.entity.Result;
import cn.fhjt.weixin.service.TbNewPicService;
import cn.fhjt.weixin.service.TbNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/news")
public class NewController {
    @Autowired
    private TbNewService tbnewService;
    @Autowired
    private TbNewPicService tbNewPicService;

    /**
     *
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody  TbNew tbNew){
        try {
            tbnewService.add(tbNew);
//            TbNewPic tbNewPic = new TbNewPic();
//            tbNewPic.setNewId(tbNew.getId());
//            tbNewPic.setPicUrl(tbNew.getSpare0());
//            tbNewPicService.add(tbNewPic);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /**
     * 修改
     * @param
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbNew tbNew){
        try {
            tbnewService.update(tbNew);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne")
    public TbNew findOne(Long id){
        return tbnewService.findOne(id);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(Long [] ids){
        try {
            tbnewService.updateByIds(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /**
     * 查询+分页
     * @param
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbNew tbNew, int page, int rows  ){
        return tbnewService.findPage(tbNew, page, rows);
    }

}

