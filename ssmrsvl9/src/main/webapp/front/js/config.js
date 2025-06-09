
var projectName = '家教平台系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '教师简历',
	url: './pages/jiaoshijianli/list.html'
}, 
{
	name: '课程信息',
	url: './pages/kechengxinxi/list.html'
}, 
{
	name: '招聘教师',
	url: './pages/zhaopinjiaoshi/list.html'
}, 

{
	name: '通知公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmrsvl9/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["查看","删除"],"menu":"教师简历","menuJump":"列表","tableName":"jiaoshijianli"}],"menu":"教师简历管理"},{"child":[{"buttons":["审核","查看"],"menu":"教师申请","menuJump":"列表","tableName":"jiaoshishenqing"}],"menu":"教师申请管理"},{"child":[{"buttons":["查看","删除"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"招聘教师","menuJump":"列表","tableName":"zhaopinjiaoshi"}],"menu":"招聘教师管理"},{"child":[{"buttons":["查看","删除"],"menu":"应聘职位","menuJump":"列表","tableName":"yingpinzhiwei"}],"menu":"应聘职位管理"},{"child":[{"buttons":["查看","删除"],"menu":"用户评价","menuJump":"列表","tableName":"yonghupingjia"}],"menu":"用户评价管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"教师简历列表","menuJump":"列表","tableName":"jiaoshijianli"}],"menu":"教师简历模块"},{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘教师列表","menuJump":"列表","tableName":"zhaopinjiaoshi"}],"menu":"招聘教师模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师申请","menuJump":"列表","tableName":"jiaoshishenqing"}],"menu":"教师申请管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"招聘教师","menuJump":"列表","tableName":"zhaopinjiaoshi"}],"menu":"招聘教师管理"},{"child":[{"buttons":["查看","审核"],"menu":"应聘职位","menuJump":"列表","tableName":"yingpinzhiwei"}],"menu":"应聘职位管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户评价","menuJump":"列表","tableName":"yonghupingjia"}],"menu":"用户评价管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"教师简历列表","menuJump":"列表","tableName":"jiaoshijianli"}],"menu":"教师简历模块"},{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘教师列表","menuJump":"列表","tableName":"zhaopinjiaoshi"}],"menu":"招聘教师模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师简历","menuJump":"列表","tableName":"jiaoshijianli"}],"menu":"教师简历管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程信息","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息管理"},{"child":[{"buttons":["查看"],"menu":"应聘职位","menuJump":"列表","tableName":"yingpinzhiwei"}],"menu":"应聘职位管理"},{"child":[{"buttons":["查看"],"menu":"用户评价","menuJump":"列表","tableName":"yonghupingjia"}],"menu":"用户评价管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"教师简历列表","menuJump":"列表","tableName":"jiaoshijianli"}],"menu":"教师简历模块"},{"child":[{"buttons":["查看"],"menu":"课程信息列表","menuJump":"列表","tableName":"kechengxinxi"}],"menu":"课程信息模块"},{"child":[{"buttons":["查看","应聘"],"menu":"招聘教师列表","menuJump":"列表","tableName":"zhaopinjiaoshi"}],"menu":"招聘教师模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
