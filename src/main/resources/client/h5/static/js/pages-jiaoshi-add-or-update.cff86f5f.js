(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-jiaoshi-add-or-update"],{2225:function(e,i,t){var r=t("cc51");"string"===typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);var n=t("4f06").default;n("f2c573ee",r,!0,{sourceMap:!1,shadowMode:!1})},"3de3":function(e,i,t){"use strict";var r,n=function(){var e=this,i=e.$createElement,t=e._self._c||i;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ffffff",height:"100%"}},[t("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"#ffffff",display:"block",height:"auto"}},[t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("教师工号")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.jiaoshigonghao,placeholder:"教师工号"},model:{value:e.ruleForm.jiaoshigonghao,callback:function(i){e.$set(e.ruleForm,"jiaoshigonghao",i)},expression:"ruleForm.jiaoshigonghao"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("密码")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.mima,placeholder:"密码"},model:{value:e.ruleForm.mima,callback:function(i){e.$set(e.ruleForm,"mima",i)},expression:"ruleForm.mima"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("教师姓名")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.jiaoshixingming,placeholder:"教师姓名"},model:{value:e.ruleForm.jiaoshixingming,callback:function(i){e.$set(e.ruleForm,"jiaoshixingming",i)},expression:"ruleForm.jiaoshixingming"}})],1),t("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("性别")]),t("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.xingbieIndex,range:e.xingbieOptions},on:{change:function(i){arguments[0]=i=e.$handleEvent(i),e.xingbieChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666666"}},[e._v(e._s(e.ruleForm.xingbie?e.ruleForm.xingbie:"请选择性别"))])],1)],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.tupianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("图片")]),e.ruleForm.tupian?t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.tupian.split(",")[0],mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("联系方式")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.lianxifangshi,placeholder:"联系方式"},model:{value:e.ruleForm.lianxifangshi,callback:function(i){e.$set(e.ruleForm,"lianxifangshi",i)},expression:"ruleForm.lianxifangshi"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("身份证号")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.shenfenzhenghao,placeholder:"身份证号"},model:{value:e.ruleForm.shenfenzhenghao,callback:function(i){e.$set(e.ruleForm,"shenfenzhenghao",i)},expression:"ruleForm.shenfenzhenghao"}})],1),t("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[t("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#ffffff",background:"#1D5DCA",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)],1)},a=[];t.d(i,"b",(function(){return n})),t.d(i,"c",(function(){return a})),t.d(i,"a",(function(){return r}))},"6f91":function(e,i,t){"use strict";t.r(i);var r=t("c2b6"),n=t.n(r);for(var a in r)"default"!==a&&function(e){t.d(i,e,(function(){return r[e]}))}(a);i["default"]=n.a},"890f":function(e,i,t){"use strict";t.r(i);var r=t("3de3"),n=t("6f91");for(var a in n)"default"!==a&&function(e){t.d(i,e,(function(){return n[e]}))}(a);t("eb8e");var o,s=t("f0c5"),u=Object(s["a"])(n["default"],r["b"],r["c"],!1,null,"7e44ab44",null,!1,r["a"],o);i["default"]=u.exports},c2b6:function(e,i,t){"use strict";var r=t("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,t("a481"),t("c5f6"),t("f559"),t("456d"),t("ac6a"),t("28a5"),t("96cf");var n=r(t("3b8d")),a=r(t("e2b11")),o=r(t("064f")),s=r(t("bd56")),u={data:function(){return{cross:"",ruleForm:{jiaoshigonghao:"",mima:"",jiaoshixingming:"",xingbie:"",tupian:"",lianxifangshi:"",shenfenzhenghao:""},xingbieOptions:[],xingbieIndex:0,user:{},ro:{jiaoshigonghao:!1,mima:!1,jiaoshixingming:!1,xingbie:!1,tupian:!1,lianxifangshi:!1,shenfenzhenghao:!1}}},components:{wPicker:a.default,xiaEditor:o.default,multipleSelect:s.default},watch:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(i){var t,r,n,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:if(r=e.sent,this.user=r.data,this.xingbieOptions="男,女".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!i.id){e.next=14;break}return this.ruleForm.id=i.id,e.next=12,this.$api.info("jiaoshi",this.ruleForm.id);case 12:r=e.sent,this.ruleForm=r.data;case 14:if(this.cross=i.cross,!i.cross){e.next=50;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 18:if((e.t1=e.t0()).done){e.next=50;break}if(a=e.t1.value,"jiaoshigonghao"!=a){e.next=24;break}return this.ruleForm.jiaoshigonghao=n[a],this.ro.jiaoshigonghao=!0,e.abrupt("continue",18);case 24:if("mima"!=a){e.next=28;break}return this.ruleForm.mima=n[a],this.ro.mima=!0,e.abrupt("continue",18);case 28:if("jiaoshixingming"!=a){e.next=32;break}return this.ruleForm.jiaoshixingming=n[a],this.ro.jiaoshixingming=!0,e.abrupt("continue",18);case 32:if("xingbie"!=a){e.next=36;break}return this.ruleForm.xingbie=n[a],this.ro.xingbie=!0,e.abrupt("continue",18);case 36:if("tupian"!=a){e.next=40;break}return this.ruleForm.tupian=n[a].split(",")[0],this.ro.tupian=!0,e.abrupt("continue",18);case 40:if("lianxifangshi"!=a){e.next=44;break}return this.ruleForm.lianxifangshi=n[a],this.ro.lianxifangshi=!0,e.abrupt("continue",18);case 44:if("shenfenzhenghao"!=a){e.next=48;break}return this.ruleForm.shenfenzhenghao=n[a],this.ro.shenfenzhenghao=!0,e.abrupt("continue",18);case 48:e.next=18;break;case 50:this.styleChange(),this.$forceUpdate();case 52:case"end":return e.stop()}}),e,this)})));function i(i){return e.apply(this,arguments)}return i}(),methods:{styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var i={color:"#666666"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var i={color:"#1D5DCA"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var i={color:"#666666"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var i={color:"#1D5DCA"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #1D5DCA",borderRadius:"100%",background:"#1D5DCA"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var i={border:"2rpx solid #1D5DCA",color:"#ffffff",borderRadius:"100%",background:"#1D5DCA"};Object.keys(i).forEach((function(t){e.style[t]=i[t]}))}))}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},tupianTap:function(){var e=this;this.$api.upload((function(i){e.ruleForm.tupian="file/"+i.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var i,t,r,n,a,o,s,u,l,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.jiaoshigonghao){e.next=3;break}return this.$utils.msg("教师工号不能为空"),e.abrupt("return");case 3:if(this.ruleForm.mima){e.next=6;break}return this.$utils.msg("密码不能为空"),e.abrupt("return");case 6:if(this.ruleForm.jiaoshixingming){e.next=9;break}return this.$utils.msg("教师姓名不能为空"),e.abrupt("return");case 9:if(!this.ruleForm.lianxifangshi||this.$validate.isMobile(this.ruleForm.lianxifangshi)){e.next=12;break}return this.$utils.msg("联系方式应输入手机格式"),e.abrupt("return");case 12:if(!this.ruleForm.shenfenzhenghao||this.$validate.checkIdCard(this.ruleForm.shenfenzhenghao)){e.next=15;break}return this.$utils.msg("身份证号应输入身份证格式"),e.abrupt("return");case 15:if(!this.cross){e.next=32;break}if(uni.setStorageSync("crossCleanType",!0),a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=32;break}if(i||(i=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=28;break}for(s in i)s==a&&(i[s]=o);return u=uni.getStorageSync("crossTable"),e.next=26,this.$api.update("".concat(u),i);case 26:e.next=32;break;case 28:t=Number(uni.getStorageSync("userid")),r=i["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 32:if(!r||!t){e.next=55;break}return this.ruleForm.crossuserid=t,this.ruleForm.crossrefid=r,l={page:1,limit:10,crossuserid:t,crossrefid:r},e.next=38,this.$api.list("jiaoshi",l);case 38:if(c=e.sent,!(c.data.total>=n)){e.next=45;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 45:if(!this.ruleForm.id){e.next=50;break}return e.next=48,this.$api.update("jiaoshi",this.ruleForm);case 48:e.next=52;break;case 50:return e.next=52,this.$api.add("jiaoshi",this.ruleForm);case 52:this.$utils.msgBack("提交成功");case 53:e.next=63;break;case 55:if(!this.ruleForm.id){e.next=60;break}return e.next=58,this.$api.update("jiaoshi",this.ruleForm);case 58:e.next=62;break;case 60:return e.next=62,this.$api.add("jiaoshi",this.ruleForm);case 62:this.$utils.msgBack("提交成功");case 63:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var i=new Date,t=i.getFullYear(),r=i.getMonth()+1,n=i.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,n=n>9?n:"0"+n,"".concat(t,"-").concat(r,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};i.default=u},cc51:function(e,i,t){var r=t("24fb");i=r(!1),i.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-7e44ab44]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=i},eb8e:function(e,i,t){"use strict";var r=t("2225"),n=t.n(r);n.a}}]);