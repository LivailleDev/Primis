import { clsx } from 'clsx';
import { HTMLAttributes, ReactNode, InputHTMLAttributes } from 'react';

export interface TextInputProps extends HTMLAttributes<HTMLInputElement> { }

export interface TextInputRootProps {
    children: ReactNode;
}

function TextInputRoot(props: TextInputRootProps) {
    return (
        <div className="py-4, px-3 bg-brown-600 text-gray-400  ring-1 ring-brown-200">
        </div>
    )
}

function TextInputIcon() { }

function TextInputInput(props: TextInputProps) {
    return (
        <input
            className={clsx(
                '',
            )}
            {...props}
        />

    )
}
export const TextInput = {
    Root: TextInputRoot,
    Input: TextInputInput,
    Icon: TextInputIcon,
  }
  export interface TextInputInputProps extends InputHTMLAttributes<HTMLInputElement> {}

