//
// MessagePack for Java
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.
//
package org.msgpack.value;

/**
 * The interface {@code StringValue} represents MessagePack's String type.
 * <p/>
 * MessagePack's String type can represent a UTF-8 string at most 2<sup>64</sup>-1 bytes.
 * <p/>
 * Note that the value could include invalid byte sequences. {@code getString()} method throws {@code MessageTypeStringCodingException} if the value includes invalid byte sequence. {@code stringValue()} method replaces an invalid byte sequence with <code>U+FFFD replacement character</code>.
 *
 * @see org.msgpack.value.RawValue
 */
public interface StringValue
        extends RawValue
{
}
