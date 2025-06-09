const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmrsvl9/",
            name: "ssmrsvl9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmrsvl9/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "家教平台系统"
        } 
    }
}
export default base
