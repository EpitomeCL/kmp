/*
 * Decompiled with CFR 0_132.
 */
package org.bitcoinj.core;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.bitcoinj.core.AddressMessage;
import org.bitcoinj.core.BitcoinSerializer;
import org.bitcoinj.core.Block;
import org.bitcoinj.core.FilteredBlock;
import org.bitcoinj.core.InventoryMessage;
import org.bitcoinj.core.Message;
import org.bitcoinj.core.MessageSerializer;
import org.bitcoinj.core.Transaction;

class DummySerializer
extends MessageSerializer {
    public static final DummySerializer DEFAULT = new DummySerializer();
    private static final String DEFAULT_EXCEPTION_MESSAGE = "Dummy serializer cannot serialize/deserialize objects as it does not know which network they belong to.";

    @Override
    public Message deserialize(ByteBuffer in) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public BitcoinSerializer.BitcoinPacketHeader deserializeHeader(ByteBuffer in) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public Message deserializePayload(BitcoinSerializer.BitcoinPacketHeader header, ByteBuffer in) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public boolean isParseRetainMode() {
        return false;
    }

    @Override
    public AddressMessage makeAddressMessage(byte[] payloadBytes, int length) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public Message makeAlertMessage(byte[] payloadBytes) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public Block makeBlock(byte[] payloadBytes, int offset, int length) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public Message makeBloomFilter(byte[] payloadBytes) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public FilteredBlock makeFilteredBlock(byte[] payloadBytes) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public InventoryMessage makeInventoryMessage(byte[] payloadBytes, int length) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public Transaction makeTransaction(byte[] payloadBytes, int offset, int length, byte[] hash) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public void seekPastMagicBytes(ByteBuffer in) throws BufferUnderflowException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public void serialize(String name, byte[] message, OutputStream out) throws IOException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }

    @Override
    public void serialize(Message message, OutputStream out) throws IOException {
        throw new UnsupportedOperationException(DEFAULT_EXCEPTION_MESSAGE);
    }
}

