package com.thread.tradition;

/**
 * Ref:http://mp.weixin.qq.com/s?__biz=MzA4NDc2MDQ1Nw==&mid=2650238326&idx=1&sn=f3700dc7b904bce4cd9e3d1cd8d5a026&chksm=87e18f90b0960686dca63de507cd9ee9d66fc35499b751a37774d8865313a483bf6c85c67e1f&scene=21#wechat_redirect
 * @author maoling
 *
 */
public class ThreadLocalTest2 {
	private static final ThreadLocal<Integer> CONTEXT = new ThreadLocal<>();
	public void setVal(int i) {
	      CONTEXT.set(i);
	}
	public int getVal() {
	    Integer val = CONTEXT.get();
	    return val == null ? 0 : val;
	}
}
