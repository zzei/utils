package com.zei.happy.base;


/**
 * 字符串处理工具类
 */
public class StrUtils {

    /**
     * 判断字符串是否为空或空字符串
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str == null || "".equals(str)){
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否为空字符串
     * @param str
     * @return
     */
    public static boolean isBlank(String str){
        if("".equals(str)){
            return true;
        }
        return false;
    }

    /**
     * 检查email格式是否正确
     * @param text
     * @return
     */
    public static boolean checkEmail(String text) {
        return text.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
    }

    /**
     * 检查电话输入 是否正确 正确格 式 012-87654321、0123-87654321、0123－7654321
     * @param text
     * @return
     */
    public static boolean checkTelephone(String text) {
        return text.matches(
                "(0\\d{2,3}-\\d{7,8})|" +
                        "(0\\d{9,11})|" +
                        "(\\d{7})|" +
                        "(\\d{8})|" +
                        "(4\\d{2}\\d{7})|" +
                        "(4\\d{2}-\\d{7})|" +
                        "(4\\d{2}-\\d{3}-\\d{4})|" +
                        "(4\\d{2}-\\d{4}-\\d{3})");
    }

    /**
     * 检查手机输入 是否正确
     * @param text
     * @return
     */
    public static boolean checkMobilephone(String text) {
        return text.matches("^1(3[0-9]|4[579]|5[0-35-9]|8[0-9]|7[015-8])\\d{8}$");
    }

    /**
     * 检查中文名输 入是否正确
     * @param text
     * @return
     */
    public static boolean checkChineseName(String text) {
        return text.matches("^[\u4e00-\u9fa5]+$");
    }

    /**
     * 检查字符串中是否有空格，包括中间空格或者首尾空格
     * @param text
     * @return
     */
    public static boolean checkBlank(String text) {
        return text.matches("^\\s*|\\s*$");
    }

    /**
     * 检查字符串是 否含有HTML标签
     * @param text
     * @return
     */

    public static boolean checkHtmlTag(String text) {
        return text.matches("<(\\S*?)[^>]*>.*?<!--\\1-->|<.*? />");
    }

    /**
     * 检查URL是 否合法
     * @param text
     * @return
     */
    public static boolean checkURL(String text) {
        return text.matches("[a-zA-z]+://[^\\s]*");
    }

    /**
     * 检查IP是否 合法
     * @param text
     * @return
     */
    public static boolean checkIP(String text) {
        return text.matches("\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}");
    }



    /**
     * 检查QQ是否 合法，必须是数字，且首位不能为0，最长15位
     * @param text
     * @return
     */

    public static boolean checkQQ(String text) {
        return text.matches("[1-9][0-9]{4,13}");
    }

    /**
     * 检查邮编是否 合法
     * @param text
     * @return
     */
    public static boolean checkPostCode(String text) {
        return text.matches("[1-9]\\d{5}(?!\\d)");
    }

    /**
     * 检查身份证是 否合法,15位或18位(或者最后一位为X)
     * @param text
     * @return
     */
    public static boolean checkIDCard(String text) {
        return text.matches("\\d{15}|\\d{18}|(\\d{17}[x|X])");
    }

    /**
     * 检查输入是否 超出规定长度
     * @param length
     * @param text
     * @return
     */
    public static boolean checkLength(String text, int length) {
        return text.length() <= length;
    }

    /**
     * 判断是否为数字
     * @param text
     * @return
     */
    public static boolean isNumber(String text) {
        return text.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }

}
