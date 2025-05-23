/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opengoofy.index12306.biz.orderservice.common.enums;

import lombok.AllArgsConstructor;
import org.opengoofy.index12306.framework.starter.convention.errorcode.IErrorCode;

/**
 * 订单取消错误码枚举
 * <p>
 * 作者：马丁
 * 加项目群：早加入就是优势！500人内部项目群，分享的知识总有你需要的 <a href="https://t.zsxq.com/cw7b9" />
 */
@AllArgsConstructor
public enum OrderCanalErrorCodeEnum implements IErrorCode {

    ORDER_CANAL_UNKNOWN_ERROR("B006001", "订单不存在，请检查相关订单记录"),

    ORDER_CANAL_STATUS_ERROR("B006002", "订单状态不正确，请检查相关订单记录"),

    ORDER_CANAL_ERROR("B006003", "订单取消失败，请稍后再试"),

    ORDER_CANAL_REPETITION_ERROR("B006004", "订单重复取消，请稍后再试"),

    ORDER_STATUS_REVERSAL_ERROR("B006005", "订单状态反转失败，请稍后再试"),

    ORDER_DELETE_ERROR("B006006", "订单状态反转失败，请稍后再试"),

    ORDER_ITEM_STATUS_REVERSAL_ERROR("B006007", "子订单状态反转失败，请稍后再试");

    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误提示消息
     */
    private final String message;

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
