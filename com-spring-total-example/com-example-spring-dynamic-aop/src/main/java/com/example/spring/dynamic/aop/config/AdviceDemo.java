package com.example.spring.dynamic.aop.config;

/**
 * 总结：5，7，5,4,535
 * Advice
 * <p>
 * |                             |                        |
 * BeforeAdvice                  AfterAdvice                Interceptor
 * |                    |                |                |
 * MethodBeforeAdvice  AfterReturningAdvice  ThrowsAdvice  MethodInterceptor (环绕通知)
 * |
 * IntroductionInterceptor（引介通知）
 * <p>
 * ===========================================================================================
 * Pointcut  -> ClassFilter(定位特定的类) | MethodMatcher(定位特定的方法)
 * |
 * <p>
 * StaticMethodMatcher                             DynamicMethodMatcher
 * |                                               |
 * StaticMethodMatcherPointcut                     DynamicMethodMatcherPointcut    AnnotationMatchingPointcut   ExpressionPointcut   ControlFlowPointcut  ComposablePointcut
 * |
 * NameMatchMethodPointcut | AbstractRegexpMethodPointcut
 * <p>
 * ================================================================================================
 * Advisor
 * |
 * PointcutAdvisor        IntroductionAdvisor
 * <p>
 * DefaultPointcutAdvisor                    DefaultIntroductionAdvisor
 * NameMatchMethodPointcutAdvisor            DeclareParentsAdvisor
 * RegexpMethodPointcutAdvisor
 * StaticMethodMatcherPointcutAdvisor -->核心
 * AspectJExpressionPointcutAdvisor 动态性
 * AspectJPointcutAdvisor
 * 注意：
 * 有些切面拥有切点的功能
 * =================================================================================================
 * 注册切面： （5,3点）
 * ProxyFactoryBean -> 接口 + 切面(通知,指定运用到了method) -->手动创建代理对象 2点
 * BeanNameAutoProxyCreator -> 接口实现bean + 切面(通知,指定运用到了method)
 * <p>
 * AspectJExpressionPointcutAdvisor -> DefaultAdvisorAutoProxyCreator + 切面(通知，表达式) -->自动创建代理对象 2点
 * AbstractBeanFactoryPointcutAdvisor
 * AbstractPointcutAdvisor
 * <p>
 * <p>
 * DefaultBeanFactoryPointcutAdvisor
 * <p>
 * AbstractAdvisingBeanPostProcessor --> 动态添加切面
 * <p>
 * //总结：2 1 情况
 * proxy + advisor
 * advisor
 * 1、注解方式注入切面 (实现也是通过下面方式2来注入到固定的集合中的)
 * 2、通过AbstractAdvisingBeanPostProcessor注入切面
 * <p>
 * private List<Advisor> advisors = new ArrayList<>(); //所有的切面
 * advisorNames = BeanFactoryUtils.beanNamesForTypeIncludingAncestors( //这种是IoC容器中获取
 * this.beanFactory, Advisor.class, true, false);
 * <p>
 * <p>
 * 步骤：
 * NameMatchMethodPointcut cacheablePointcut = new NameMatchMethodPointcut();
 * cacheablePointcut.addMethodName(methodName);
 * <p>
 * QueryResultCacheInterceptor cacheInterceptor = new QueryResultCacheInterceptor(objClazzHavingAnnotatedMethods);
 * Advisor cacheableAdvisor = new DefaultPointcutAdvisor(cacheablePointcut, cacheInterceptor);
 * <p>
 * proxyFactory.addAdvisor(cacheableAdvisor);
 * proxyFactory.setTarget(target);
 * T proxy = (T) proxyFactory.getProxy();
 * <p>
 * <p>
 * 重复注解Repeatable
 */
public class AdviceDemo {
}
