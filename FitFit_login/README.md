<h1>后端改动</h1>
<h3>1.新加入的Controller和Service全部测试完毕，在Postman能跑通，但仍未和前端进行连接测试</h3>
<h3>2.评论ID和食谱ID生成规则</h3>

    commentId = userId + recipeId + createTimeStamp

    recipeId = ownerId + createTimeStamp

<h3>3.为了方便测试修改了如下代码，跳过了验证过程</h3>
代码路径:com/example/seprojback/config/SecurityConfig.java

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //关闭csrf
                .csrf().disable()
                //不通过Session获取SecurityContext
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                // 对于登录接口 允许匿名访问
                .antMatchers("/user/login").anonymous()
                // 除上面外的所有请求全部需要鉴权认证
                /*暂时跳过验证过程*/
                //.anyRequest().authenticated();
                .anyRequest().anonymous();

        http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
    }
