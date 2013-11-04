package com.nhn.pinpoint.profiler.context;

/**
 *
 */
public interface TraceId {

    TraceId getNextTraceId();

    long getSpanId();

    String getTransactionId();

    String getAgentId();

    long getAgentStartTime();

    long getTransactionSequence();

    long getParentSpanId();

    short getFlags();

    boolean isRoot();
}
