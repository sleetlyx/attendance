//服务层
app.service('checkInRecordService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../checkInRecord/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../checkInRecord/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../checkInRecord/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../checkInRecord/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../checkInRecord/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../checkInRecord/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity,startdate,enddate){
		return $http.post('../checkInRecord/search.do?page='+page+"&rows="+rows+"&startdate="+startdate+"&enddate="+enddate, searchEntity);
	}    	
});
