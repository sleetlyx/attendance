 //控制层 
app.controller('checkInRecordController' ,function($scope,$controller   ,checkInRecordService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		checkInRecordService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		checkInRecordService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		checkInRecordService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=checkInRecordService.update( $scope.entity ); //修改  
		}else{
			serviceObject=checkInRecordService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		checkInRecordService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){


//如果存在结束日期 必须有开始日期
		if($scope.enddate != null && !angular.isUndefined($scope.enddate)){

			if(angular.isUndefined($scope.startdate)|| $scope.startdate == null){
				alert("有终止日期时，必须有开始日期");
				return;
			}
		}
		//存在起始日期  必须小于当前日期  且不能大于终止日期
		else  if($scope.startdate != null && !angular.isUndefined($scope.startdate)){
			var crentTime = new Date(new Date().getTime());
			var crent = crentTime.valueOf(); // 时间戳

			var starttTime = new Date($scope.startdate);
			var start = starttTime.valueOf(); // 时间戳

			if(start > crent){
				alert("起始时间不得大于当前时间");
				return;
			}
			else if($scope.enddate != null || !angular.isUndefined($scope.enddate) ){
				var sendTime = new Date($scope.enddate);
				var end = sendTime.valueOf(); // 时间戳
				if(start > end){
					alert("起始时间不得大于终止日期时间");
					return;
				}
			}
			// else if(angular.isUndefined($scope.enddate) || $scope.enddate == null){
			// 	$scope.enddate = new Date(new Date().getTime());
			// }

		}


		checkInRecordService.search(page,rows,$scope.searchEntity,$scope.startdate,$scope.enddate).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	
