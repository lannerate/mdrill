package com.alimama.quanjingmonitor.parser;

import java.io.*;
import java.net.*;
import java.util.*;

import com.taobao.loganalyzer.input.p4ppv.parser.*;



public class P4PPVLogParser
    implements Parser
{

    public P4PPVLogParser()
    {
    }


	public Object parse(String raw) throws InvalidEntryException {
		try {
			P4PPVLog p4ppvlog = com.taobao.loganalyzer.input.p4ppv.parser.P4PPVLogParser
					.parse(raw);
			
			if (p4ppvlog == null) {
				throw new InvalidEntryException("Invalid log `" + raw + "'");
			}

			return p4ppvlog;
		} catch (Throwable nfe) {
			throw new InvalidEntryException("Invalid log `" + raw + "'\n" + nfe);
		}
	}
}
