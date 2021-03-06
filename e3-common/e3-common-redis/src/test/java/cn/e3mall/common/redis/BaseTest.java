package cn.e3mall.common.redis;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;

/**
 * 基础测试类
 *
 * @author colg
 */
@Slf4j
public abstract class BaseTest {

    private long time;

    @Before
    public void setUp() {
        time = System.currentTimeMillis();
    }

    @After
    public void tearDown() {
        log.info("Junit: [{}ms]", DateUtil.spendMs(time));
        log.info("----------------------------------------------------------------------------------------------------");
    }

}
